package p0001

func twoSum(nums []int, target int) []int {

	numToIndexMap := make(map[int]int)

	for index, value := range nums {
		complement := target - value
		complementIndex, found := numToIndexMap[complement]

		if found {
			return []int{complementIndex, index}
		} else {
			numToIndexMap[value] = index
		}
	}

	return nil
}
