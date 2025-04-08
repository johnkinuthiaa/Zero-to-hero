weight =float(input("Weight: "))
units =input("(L) for kg->pounds \nor\n(K)gs for pounds->kgs ").lower()
if units =="l":
    weight /=0.45359237
    print(weight)
elif units =="k":
    weight *= 0.45359237
    print(weight)
else:
    print("Invalid units")