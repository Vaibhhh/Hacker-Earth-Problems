fac = 1
n = input()

if n<0:
    print ("NA")
elif n==0:
    print (0)
else :
    for i in range (1,n+1):
        fac = fac*i
    print (fac)                             
