package com.lab.kot.school.ui.handler.utility;
import java.util.Collection;
import java.util.Collections;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.apache.myfaces.trinidad.convert.ClientConverter;

public class YNConverter implements Converter, ClientConverter {
    public YNConverter() {
        super();
    }
  public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value)
   {
     return "true".equals(value) ? "Y" : "N";
   }

   public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value)
   {
     return "Y".equals(value) ? "true" : "false";
   }

   public String getClientLibrarySource(FacesContext facesContext)
   {
     return null;
   }

   public Collection<String> getClientImportNames()
   {
     return Collections.emptySet();
   }

   public String getClientScript(FacesContext facesContext, UIComponent uiComponent)
   {
     return null;
   }

   public String getClientConversion(FacesContext facesContext, UIComponent uiComponent)
   {
     return null;
   }
}
