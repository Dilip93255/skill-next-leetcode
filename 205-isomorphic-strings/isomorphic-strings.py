class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        l1=[]
        l2=[]
        for i in s:
            l1.append(s.index(i))
        print(l1)
        for i in t:
            l2.append(t.index(i))
        print(l2)
        if l1==l2:
            return True
        return False            
        