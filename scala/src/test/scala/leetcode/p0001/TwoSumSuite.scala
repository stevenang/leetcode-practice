package leetcode.p0001

class TwoSumSuite extends munit.FunSuite:

  private val testCases = List(
    (
      "standard example",
      Array(2, 7, 11, 15),
      9,
      Array(0, 1)
    ),
    (
      "matching values in the middle",
      Array(3, 2, 4),
      6,
      Array(1, 2)
    ),
    (
      "duplicate values",
      Array(3, 3),
      6,
      Array(0, 1)
    ),
    (
      "negative numbers",
      Array(-3, 4, 3, 90),
      0,
      Array(0, 2)
    ),
    (
      "negative target",
      Array(-1, -2, -3, -4, -5),
      -8,
      Array(2, 4)
    )
  )

  testCases.foreach { case (name, nums, target, expected) =>
    test(name) {
      val actual = TwoSum.solution(nums, target)

      assertEquals(
        actual.toSeq,
        expected.toSeq
      )
    }
  }