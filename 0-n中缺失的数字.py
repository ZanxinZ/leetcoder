class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        l,r,m =0,len(nums)-1,0
        while l<=r:
            m = int((l+r)/2)
            if nums[m]==m:
                l = m + 1
            elif nums[m]>m:
                r = m -1
        return l