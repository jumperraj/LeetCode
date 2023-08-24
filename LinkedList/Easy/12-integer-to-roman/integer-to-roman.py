class Solution:
    def intToRoman(self, num: int) -> str:
        ar=[]
        tens=['','I','X','C','M']
        fives=['','V','L','D']
        num2=num
        list=[]
        i=4
        str
        for i in range(1,5):
            ar.append(int(num2 / 10 ** (4 - i)))
            num2=num2-int(num2/10**(4-i))*(10**(4-i))
        for i in range(4):
            if 3 < ar[i] <= 9:
                if ar[i] == 4:
                    list.append(tens[4 - i])
                    list.append(fives[4 - i])
                elif ar[i]==9:
                    list.append(tens[4-i])
                    list.append(tens[5-i])
                elif ar[i] == 5:
                    list.append(fives[4 - i])
                else:
                    list.append(fives[4 - i])
                    for j in range(ar[i] - 5):
                        list.append(tens[4 - i])
            else:
                for j in range(ar[i]):
                    list.append(tens[4 - i])
        mystring=''
        for i in list:
            mystring+=''+i

        return(mystring)

