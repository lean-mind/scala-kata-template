import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should

class MarsRoverTest extends AnyFunSpec with should.Matchers {

  describe("Hello World") {
    it("says hello world") {
      val text = new HelloWorld().helloWorld()

      text should be("Hello World")
    }
  }
}
