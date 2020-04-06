// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/GR00673765/DemoApplications/play-framework/java-play-framework-tutorials/conf/routes
// @DATE:Mon Apr 06 12:43:40 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
