
class Foo(val x: Int) extends AnyVal

@deprecated("Suppress warnings", since="2.11")
object Test extends App {
  import scala.reflect.ClassManifest
  println(implicitly[ClassManifest[Foo]])
}
