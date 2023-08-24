class Solution:
    def reverse(self, nums: int) -> int:
        if nums>(2**31)-1 or nums<-2**31:
            return 0
        if nums<0:
            nums2=nums*-1
            flag=1
        else :
            nums2=nums
            flag=0
        def dig( n):
            count=0
            i=n
            while i >=1:
                i=i/10
                count+=1
            return count
        i=dig(nums2)-1
        n=0
        nums3=nums2
        while 0 <=i:
            n= n+int(nums2/10**i)*(10**(dig(nums3)-1-i))
            nums2=nums2-int(nums2/10**i)*(10**i)
            i-=1
        if n>(2**31)-1 or n<-2**31:
            return 0
        return(n*(-1) if flag==1 else n)