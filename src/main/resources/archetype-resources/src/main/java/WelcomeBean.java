#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;

@ManagedBean
@RequestScoped
@URLMapping(id = "welcome", pattern = "/welcome", viewId = "/faces/welcome-page.xhtml")
public class WelcomeBean
{

   private Date currentDate = null;

   @URLAction(onPostback = true)
   public void initView()
   {
      currentDate = new Date();
   }

   public Date getCurrentDate()
   {
      return currentDate;
   }

}