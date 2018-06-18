
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateUserForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usr: Form[CreateUserForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
    """),_display_(/*6.6*/request/*6.13*/.messages(key)),format.raw/*6.27*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
    """),_display_(/*10.6*/form(routes.UserController.addUser())/*10.43*/ {_display_(Seq[Any](format.raw/*10.45*/("""
        """),_display_(/*11.10*/inputText(usr("name"))),format.raw/*11.32*/("""

        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""

        """),format.raw/*15.9*/("""<div class="buttons">
            <input type="submit" value="Add User"/>
        </div>
    """)))}),format.raw/*18.6*/("""
""")))}))
      }
    }
  }

  def render(usr:Form[CreateUserForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(usr)(request)

  def f:((Form[CreateUserForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (usr) => (request) => apply(usr)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jun 17 21:21:08 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick/app/views/user.scala.html
                  HASH: a9828525a9014b6115bb7641df348ab0d8797c4b
                  MATRIX: 764->1|905->72|949->70|976->88|1003->90|1017->97|1050->122|1096->131|1127->137|1142->144|1176->158|1207->160|1235->163|1269->189|1308->191|1340->197|1386->234|1426->236|1463->246|1506->268|1544->279|1557->283|1588->293|1625->303|1749->397
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|37->13|37->13|39->15|42->18
                  -- GENERATED --
              */
          