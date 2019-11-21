package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class JSFUtil {

	public static void setInfoMessage(String msg) {
		setInfoMessage(null, msg);
	}

	public static void setErrorMessage(String msg) {
		setErrorMessage(null, msg);
	}

	public static void setInfoMessage(String id, String msg) {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, "Info");
		FacesContext.getCurrentInstance().addMessage(id, facesMessage); // <h:messages />
	}

	public static void setErrorMessage(String id, String msg) {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,  msg,"Fehler");
		FacesContext.getCurrentInstance().addMessage(id, facesMessage); // <h:messages />
	}

}