package LoginModule;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;

import AbstractModules.CUIAbstractModule;

public class CLoginWindowController extends SelectorComposer<Component> {

	private static final long serialVersionUID = -2825215875104298567L;

	public static CUIAbstractModule MainModule = null;
	
	public void doAfterCompose( Component component ) throws Exception {

		super.doAfterCompose( component );

	}
	
	public String Translate( String strMessage ) {
		
		String strTranslatedMessage = "";

		if ( MainModule != null ) {
			
			strTranslatedMessage = MainModule.Translate( strMessage );
			
		}
		else {
			
			strTranslatedMessage = strMessage;
			
		}
			
		return strTranslatedMessage;
		
		
	}
	
    public String getMainIconPath( String strIconSize ) {
    	
		String strMainIconPath = "";

		if ( MainModule != null ) {
			
			strMainIconPath = MainModule.getMainIconPath( strIconSize );
			
		}
			
		return strMainIconPath;
    	
    }
    
	public String getImagePath( String strImageName ) {
		
		String strImagePath = "";
		
		if ( MainModule != null ) {
			
			strImagePath = MainModule.getImagePath( strImageName );
			
		}
			
		return strImagePath;
		
	}
	
}
