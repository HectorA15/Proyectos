def calculadora ():
    global Mondongo
    mensaje = '\n Seleccione 1 para multiplicar || Seleccione 2 para dividir || Seleccione 3 para sumar || Seleccione 4 para restar || Seleccione 5 para salir \n :'
    operacion = input(mensaje)

    if operacion == '1':
        prim_num = int(input('Primer numero: '))
        seg_num = int(input('Segundo numero: '))
        multiplicacion = prim_num * seg_num
        print('El resultado es', multiplicacion)
        

    elif operacion == '2':
        prim_num = int(input('Primer numero: '))
        seg_num = int(input('Segundo numero: '))
        dividir = prim_num // seg_num
        print('El resultado es', dividir)
        

    elif operacion == '3':
        prim_num = int(input('Primer numero: '))
        seg_num = int(input('Segundo numero: '))
        sumar = prim_num + seg_num
        print('El resultado es', sumar)
        

    elif operacion == '4':
        prim_num = int(input('Primer numero: '))
        seg_num = int(input('Segundo numero: '))
        resta = prim_num - seg_num
        print('El resultado es', resta)
        

    elif operacion == '5':
        Mondongo = 0
        print('Saliendo del programa...')
        
        

    else:
        print('Seleccione una opcion valida\n')
        calculadora()     
      
Mondongo = 1
while Mondongo == 1:
    calculadora()
