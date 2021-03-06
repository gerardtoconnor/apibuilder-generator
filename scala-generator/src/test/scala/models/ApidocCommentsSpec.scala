package scala.models

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class ApidocCommentsSpec extends AnyFunSpec with Matchers {

  it("with only version") {
    ApidocComments("1.0", None).toJavaString should be("""
/**
 * Generated by API Builder - https://www.apibuilder.io
 * Service version: 1.0
 */
""".trim)

    ApidocComments("1.0", None).forPlayRoutes should be("""
# Generated by API Builder - https://www.apibuilder.io
# Service version: 1.0
""".trim)
  }

}
