# used to iterate over collections

names =["angie","mwangie","kinuthia"]
for name in names:
    # this prints out every item in the names list
    print(name)


# range- creates a range of numbers we can iterate over
# it can include a step
for i in range(10):
    print(i)


# use a for loop to get the total price
prices =[10,20,30]
sum=0
for price in prices:
    sum+=price
print(f"The total is {sum}")

# printing all the planets in list
planets = ['Mercury', 'Venus', 'Earth', 'Mars', 'Jupiter', 'Saturn', 'Uranus', 'Neptune']

for planet in planets:
    print(planet,end=" ")

# printing the product of a list


multiplicands = (2, 2, 2, 3, 3, 5)
# total product is initialized as 1 not zero because 0*any number is 0
product =1
# print statement for escaping into a new line
print("")
for num in multiplicands:
    product *=num
print(product)


# you can loop through every character in a string

s = 'steganograpHy is the practicE of conceaLing a file, message, image, or video within another fiLe, message, image, Or video.'
hidden_msg =''

for letter in s:
    if(letter.isupper()):
        hidden_msg +=letter

print(hidden_msg)
# escape
print("")

nums =[1,2,3,4,5]
total =[num for num in nums]
print(total)