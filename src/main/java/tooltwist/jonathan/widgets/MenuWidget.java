package tooltwist.jonathan.widgets;

import tooltwist.ecommerce.AutomaticUrlParametersMode;
import tooltwist.ecommerce.RoutingUIM;
import tooltwist.wbd.CodeInserter;
import tooltwist.wbd.CodeInserterList;
import tooltwist.wbd.JavascriptCodeInserter;
import tooltwist.wbd.Navpoint;
import tooltwist.wbd.PageImportCodeInserter;
import tooltwist.wbd.SnippetParam;
import tooltwist.wbd.StylesheetCodeInserter;
import tooltwist.wbd.WbdCache;
import tooltwist.wbd.WbdException;
import tooltwist.wbd.WbdGenerator;
import tooltwist.wbd.WbdGenerator.GenerationMode;
import tooltwist.wbd.WbdNavPointProperty;
import tooltwist.wbd.WbdRenderHelper;
import tooltwist.wbd.WbdSession;
import tooltwist.wbd.WbdSizeInfo;
import tooltwist.wbd.WbdStringProperty;
import tooltwist.wbd.WbdWidget;
import tooltwist.wbd.WbdWidgetController;
import tooltwist.wbd.WbdProductionHelper;





//import tooltwist.jonathan.productionHelpers.MenuProductionHelper;
import com.dinaa.ui.UimData;
import com.dinaa.ui.UimHelper;

/**
 * Menu
 */
public class MenuWidget extends WbdWidgetController
{
	private static final String SNIPPET_PREVIEW = "menu_preview.html";
	private static final String SNIPPET_DESIGN = "menu_design.html";
	private static final String SNIPPET_PRODUCTION = "menu_production.jsp";
	private static final boolean USE_PRODUCTION_HELPER = false;

	@Override
	protected void init(WbdWidget instance) throws WbdException
	{
		instance.defineProperty(new WbdStringProperty("elementId", null, "Id", ""));
		instance.defineProperty(new WbdNavPointProperty("myMenu", null, "My Menu", ""));
//		instance.defineProperty(new WbdNavPointProperty("navpoint", null, "Navpoint", ""));
	}
	
	@Override
	public void getCodeInserters(WbdGenerator generator, WbdWidget instance, UimData ud, CodeInserterList codeInserterList) throws WbdException
	{
//TODO: Uncomment this as required
		GenerationMode mode = generator.getMode();
		if (mode == GenerationMode.DESIGN)
		{
			// Add code inserters for design mode
			CodeInserter[] arr = {

				// Include a CSS snippet
				new StylesheetCodeInserter(generator, instance, "menu_cssHeader.css"),
			};
			codeInserterList.add(arr);
		}
		else if (mode == GenerationMode.PREVIEW)
		{
			// Add code inserters for preview mode
			CodeInserter[] arr = {
//				// Link to an external Javascript file
//				new JavascriptLinkInserter(jsUrl),

//				// Link to an external stylesheet
//				new StylesheetLinkInserter(cssUrl),

				// Include a javascript snippet 
				new JavascriptCodeInserter(generator, instance, "menu_jsHeader.js"),

				// Include a CSS snippet
				new StylesheetCodeInserter(generator, instance, "menu_cssHeader.css"),
			};
			codeInserterList.add(arr);
		}
		else if (mode == GenerationMode.PRODUCTION || generator.getMode() == GenerationMode.CONTROLLER)
		{
			// Add code inserters for production mode
			CodeInserter[] arr = {
//				// Link to an external Javascript file
//				new JavascriptLinkInserter(jsUrl),
					
//				// Link to an external stylesheet
//				new StylesheetLinkInserter(cssUrl),
					
				// Include a javascript snippet 
				new JavascriptCodeInserter(generator, instance, "menu_jsHeader.js"),
					
				// Include a CSS snippet
				new StylesheetCodeInserter(generator, instance, "menu_cssHeader.css"),

//				// Add import statements to the JSP
//				new PageImportCodeInserter(XData.class.getName()),
			};
			codeInserterList.add(arr);

			if (USE_PRODUCTION_HELPER)
			{
				SnippetParam[] productionHelperParams = null;
//				codeInserterList.add(WbdProductionHelper.codeInserter(instance, MenuProductionHelper.class.getName(), productionHelperParams));
//				codeInserterList.add(new PageImportCodeInserter(MenuProductionHelper.class.getName()));
			}
		}

	}
	
	@Override
	public String getLabel(WbdWidget instance) throws WbdException
	{
		return "menu";
	}
	
	@Override
	public WbdSizeInfo getSizeInfo(WbdGenerator generator, WbdWidget instance) throws WbdException
	{
		return WbdSizeInfo.unknownSizeInfo();
	}
	
	@Override
	public void renderForPreview(WbdGenerator generator, WbdWidget instance, UimData ud, WbdRenderHelper rh) throws WbdException
	{
		rh.renderSnippetForStaticPage(generator, instance, SNIPPET_PREVIEW, getSnippetParams(generator, instance, ud));
	}
	
	@Override
	public void renderForDesigner(WbdGenerator generator, WbdWidget instance, UimData ud, WbdRenderHelper rh) throws WbdException
	{
		rh.renderSnippetForStaticPage(generator, instance, SNIPPET_DESIGN, getSnippetParams(generator, instance, ud));
	}
	
	@Override
	public void renderForJSP(WbdGenerator generator, WbdWidget instance, UimHelper ud, WbdRenderHelper rh) throws Exception
	{
//		rh.beforeProductionCode(generator, instance, getSnippetParams(generator, instance, ud), USE_PRODUCTION_HELPER);
//		rh.renderSnippetForProduction(generator, instance, SNIPPET_PRODUCTION);
//		rh.afterProductionCode(generator, instance);
		rh.beforeProductionCode(generator, instance, getSnippetParams(generator, instance, ud), USE_PRODUCTION_HELPER);
		//rh.renderSnippetForProduction(generator, instance, SNIPPET_PRODUCTION);
		
		//Navpoint mainNavpoint = WbdCache.findNavpointInAnyLoadedProject("jonathan-mainMenu", false);
		
				
		Navpoint mainNavpoint = WbdCache.findNavpointInAnyLoadedProject(instance.getProperty("myMenu", null), false);
		
		rh.append("<div id='cssmenu'>\n" + 
				"<ul>\n" );
		
		String currentNavpoint = WbdSession.getNavpointId(ud.getCredentials());
		
		constructChildren(mainNavpoint, rh, currentNavpoint, ud);
		
		rh.append("</ul>\n" + 
		"</div>");
			
		rh.afterProductionCode(generator, instance);
	}
	
	private void constructChildren(Navpoint mainNavpoint, WbdRenderHelper rh, String currentNavpoint, UimData ud) throws WbdException{
		
		for (Navpoint nav : mainNavpoint.getChildren()) {
									
			String classActive = "";
			if(currentNavpoint.equals(nav.getId())){
				classActive = "active";
			}
			
			boolean hasChild = nav.hasChildren(true);
			String hasChildren = "";
			if(hasChild){
				hasChildren = "has-sub";
			}
			
			String navpointUrl = RoutingUIM.navpointUrl(ud, nav.getId(), AutomaticUrlParametersMode.NO_AUTOMATIC_URL_PARAMETERS);
			rh.append("   <li class='" + classActive + " " + hasChildren + "'><a href='"+navpointUrl+"'><span>"+nav.getLabel()+"</span></a>\n");
			
			if(hasChild){
				rh.append("<ul>\n");
//				for(Navpoint nav2:nav.getChildren()){
//					rh.append("   <li class='has-sub'><a href='"+nav2.getId()+"'><span>"+nav2.getLabel()+"</span></a></li>\n");
//				}
				constructChildren(nav, rh, currentNavpoint, ud);
				rh.append("</ul>");
			}
			rh.append("</li>\n");
		}
	}
	
	private SnippetParam[] getSnippetParams(WbdGenerator generator, WbdWidget instance, UimData ud) throws WbdException {
		String myMenu = instance.getProperty("myMenu", null);
//		String myNavpoint = instance.getProperty("myNavpoint", null);
		SnippetParam[] params = {
			new SnippetParam("menu", myMenu)
//			new SnippetParam("myNavpoint", myNavpoint)
		};
		return params;
	}
}
