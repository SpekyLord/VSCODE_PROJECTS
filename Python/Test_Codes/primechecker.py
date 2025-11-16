def checkprime(n):
    placeholder = 0
    modulo = 0
    check_prime = 0
    while (placeholder < n):
        placeholder += 1
        modulo += 1
        if (n % modulo == 0):
            check_prime += 1
    if (check_prime == 2):
        return True
    else:
        return False


print(checkprime(5))  
print(checkprime(17))
print(checkprime(4))                  