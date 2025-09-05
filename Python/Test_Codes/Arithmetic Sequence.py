

input_num = int(input("Enter a number: ")) # Enter a number

# stores the sum
temp_number = 0

# loop for sum of numbers
for add_number in range (input_num):
    add_number += 1

    #adds the number to temp_number 
    temp_number += add_number    
               
    # an if statement to check for the last number so it doesn't add a extra +
    if add_number < input_num:              
        print(f"{add_number} + ", end="")
    else:
        print(f"{add_number} ", end="")
    

print(f"= {temp_number}")