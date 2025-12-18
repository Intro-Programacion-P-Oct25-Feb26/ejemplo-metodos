def main():
    numero = input("Ingrese un número para verificar: ")
    numero = int(numero)
    valor = es_primo(numero)
    if valor:
        valor_sophie_germain = es_sophie_germain(numero)
        if valor_sophie_germain:
            print(f"El número {numero} es un primo de Sophie Germain")
        else:
            print(f"El número {numero} NO es un primo de Sophie Germain")
    else:
        print(f"El número {numero} ingresado no es primo")


def es_primo(n):
    contador = 0
    for i in range(1, n + 1):
        if n % i == 0:
            contador = contador + 1

    if contador == 2:
        return True
    else:
        return False


def es_sophie_germain(n):
    valor = 2 * n + 1
    return es_primo(valor)


if __name__ == "__main__":
    main()
