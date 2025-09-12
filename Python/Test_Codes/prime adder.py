def addprimenumbers(n):
    number = 0
    sum_ofprime = 0

    while (number < n):
        number += 1
        modulo = 0      
        check_prime = 0 
        while (modulo < number):    
            modulo += 1
            if (number % modulo == 0):
                check_prime += 1
        if (check_prime == 2):
            sum_ofprime = sum_ofprime + number
    return sum_ofprime

print(addprimenumbers(1000))
    




                 