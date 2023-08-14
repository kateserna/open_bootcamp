import operaciones as op

def main():
    sum = op.suma(10, 2)
    print("Suma:", sum)
    res = op.resta(10, 5)
    print("Resta:", res)
    multi = op.multiplica(5, 3)
    print("Multiplicar:", multi)
    divi = op.divide(10, 3)
    print("Dividir:", divi)
    divi = op.divide(10, 0)
    print("Dividir:", divi)

if __name__ == '__main__':
    main()