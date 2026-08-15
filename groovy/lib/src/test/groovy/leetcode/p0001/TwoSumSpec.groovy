package leetcode.p0001

import spock.lang.Specification
import spock.lang.Unroll

class TwoSumSpec extends Specification {

    @Unroll
    def "returns #expected when nums is #nums and target is #target"() {
        given:
        def twoSum = new TwoSum()

        expect:
        twoSum.solution(nums as int[], target).toList() == expected

        where:
        nums                | target || expected
        [2, 7, 11, 15]      | 9      || [0, 1]
        [3, 2, 4]           | 6      || [1, 2]
        [3, 3]              | 6      || [0, 1]
        [-3, 4, 3, 90]      | 0      || [0, 2]
        [-1, -2, -3, -4, -5]| -8     || [2, 4]
    }
}