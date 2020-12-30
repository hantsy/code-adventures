package examples.first

import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.mutable

class FirstSpec extends AnyFlatSpec {

    "A Stack" should "pop values in last-in-first-out order" in {
      val stack = new mutable.Stack[Int]
      stack.push(1)
      stack.push(2)
      assert(stack.pop() === 2)
      assert(stack.pop() === 1)
    }

    it should "throw NoSuchElementException if an empty stack is popped" in {
      val emptyStack = new mutable.Stack[String]
      assertThrows[NoSuchElementException] {
        emptyStack.pop()
      }
    }
  }