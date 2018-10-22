package example

import cats.Monoid
import cats.kernel.Monoid._

object Monoidal {
  def apply[A](implicit monoid: Monoid[A]) = monoid
}

object BooleanMonoidInstances {

  // TODO 03: implement ANDMonoid
  val ANDMonoid = new Monoid[Boolean] {
    override def empty: Boolean = false

    override def combine(x: Boolean, y: Boolean): Boolean = x && y
  }

  // TODO 03: implement ORMonoid
  val ORMonoid = new Monoid[Boolean] {
    override def empty: Boolean = false

    override def combine(x: Boolean, y: Boolean): Boolean = x || y
  }

}
