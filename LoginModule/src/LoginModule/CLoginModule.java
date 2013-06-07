package LoginModule;

import java.util.ArrayList;
import java.util.HashMap;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;

import AbstractModules.CUIAbstractModuleAnonymousDesktop;
import AbstractModules.CModuleDependencies;
import AbstractModules.CUIAbstractModule;

public class CLoginModule extends CUIAbstractModuleAnonymousDesktop {

	@Override
	public String getModuleName( String strLanguageName ) {

		String strModuleName =  "Security login window";
		
		if ( strLanguageName != null ) {
		
			if ( strLanguageName.equals( "es" ) ) {

				strModuleName =  "Ventana de inicio de sesion";

			}
		
		}
		
		return strModuleName;
		
	}

	@Override
	public String getModuleInternalName() {

		return "Security.Login";
		
	}
	
	@Override
	public String getModuleNameGUID() {

		return "aa4725f4-b01d-46b0-8f7d-4f8d476e44b5";
		
	}

	@Override
	public String getModuleDescription( String strLanguageName ) {
		
		String strModuleDescription =  "Allow to security login in system";
		
		if ( strLanguageName != null ) {
		
			if ( strLanguageName.equals( "es" ) ) {

				strModuleDescription =  "Permite iniciar sesión en el sistema";

			}
		
		}
		
		return strModuleDescription;
		
	}

	@Override
	public String getModuleVersion() {

		return "1.0.0.0";
		
	}


	@Override
	public ArrayList<CModuleDependencies> getModuleDependencies() {

		// this module no has dependencies 
		return new ArrayList<CModuleDependencies>();
		
	}

	@Override
	public String getMainIconPath( String strIconSize ) {

		String strIconPath = "";
		
		if ( strIconSet.equals( "vista" ) ) { 
		
			switch ( strIconSize ) {
				
			    case "16x16":{ strIconPath = "~./LoginModule/mainicon/vista/16x16.png"; break; }
			    case "24x24":{ strIconPath = "~./LoginModule/mainicon/vista/24x24.png"; break; }
			    case "32x32":{ strIconPath = "~./LoginModule/mainicon/vista/32x32.png"; break; }
			    case "48x48":{ strIconPath = "~./LoginModule/mainicon/vista/48x48.png"; break; }
			    case "64x64":{ strIconPath = "~./LoginModule/mainicon/vista/64x64.png"; break; }
			    case "128x128":{ strIconPath = "~./LoginModule/mainicon/vista/128x128.png"; break; }
				
			}

		}
		else {
			
			switch ( strIconSize ) {
			
			    case "16x16":{ strIconPath = "~./LoginModule/mainicon/16x16.png"; break; }
			    case "24x24":{ strIconPath = "~./LoginModule/mainicon/24x24.png"; break; }
			    case "32x32":{ strIconPath = "~./LoginModule/mainicon/32x32.png"; break; }
			    case "48x48":{ strIconPath = "~./LoginModule/mainicon/48x48.png"; break; }
			    case "64x64":{ strIconPath = "~./LoginModule/mainicon/64x64.png"; break; }
			    case "128x128":{ strIconPath = "~./LoginModule/mainicon/128x128.png"; break; }
			
		    }
			
		} 
		
		return strIconPath;
		
	}

	@Override
    public Component getUIComponents( Execution CurrentExecution, Component Parent, @SuppressWarnings("rawtypes") HashMap Args ) {

	    Component UIComponent = null;
	    
	    if ( CurrentExecution != null ) 
	    	UIComponent = CurrentExecution.createComponents( "~./LoginModule/uiviews/login.window.zul", Parent, Args );

	    return UIComponent;
	
	}

	@Override
	public DesktopPosition getDesktopPosition() {

		return DesktopPosition.Center;
		
	}

	@Override
	public String getTranslateLabel(String strLabel) {

		return null;
		
	}

	@Override
	public String getImagePath(String strIconName) {

		return null;
		
	}
	
	@Override
	public int InitModule() {

		return 1; //Ok
		
	}

	@Override
	public boolean ModuleActivated() {
	
		return true;

	}			

	public static void main(String[] args) {

		CUIAbstractModule Module = new CLoginModule();
		
		System.out.println( "Module name:" + Module.getModuleName( null ) );
		System.out.println( "Module internal name: " + Module.getModuleInternalName() );
		System.out.println( "Module name GUID: " + Module.getModuleNameGUID() );
		System.out.println( "Module version: " + Module.getModuleVersion() );
		System.out.println( "Module description: " + Module.getModuleDescription( null ) );
		System.out.println( "-------" );
		System.out.println( "Dependencies:" );

		ArrayList<CModuleDependencies> ModuleDependencies = Module.getModuleDependencies();
		
		for ( int I=0; I < ModuleDependencies.size(); I++ ) {
			
			System.out.println( "Module name: " + ModuleDependencies.get( I ).strModuleName );
			System.out.println( "Module name GUID: " + ModuleDependencies.get( I ).strModuleNameGUID );
			System.out.println( "Module minimal version: " + ModuleDependencies.get( I ).strMinimalVersion );
			System.out.println( "Module miximal version: " + ModuleDependencies.get( I ).strMaximalVersion );
			System.out.println( "-------" );
			System.out.println( "Only this versions:" );
			
			ArrayList<String> strOnlyThisVersions = ModuleDependencies.get( I ).strOnlyThisVersions;
			
			for ( int J=0; J < strOnlyThisVersions.size(); J++ ) {   
			
			    System.out.println( "Version: " + strOnlyThisVersions.get( J ) );
			
			}
		}
		
		System.out.println( "-------" );
		System.out.println( "Icons path:" );

		String strIconSizes[] = { "16x16", "24x24", "32x32", "64x64", "128x128" };
		
		//16x16 24x24 32x32 64x64 128x128
		for ( int I=0; I < strIconSizes.length; I++ ) {
		
			System.out.println( "Icon size: " + strIconSizes[ I ] );
			System.out.println( "Icon path: " + Module.getMainIconPath( strIconSizes[ I ] ) );
			
		}
		
	}

}
