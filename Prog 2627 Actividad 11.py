#Ejercicio 11: Reparto de Caramelos
caramelos = int(input("¿Cuántos caramelos hay? "))
alumnos = int(input("¿Cuántos alumnos hay? "))

caramelos_por_alumno = caramelos // alumnos
caramelos_sobrantes = caramelos % alumnos

print("A cada alumno le corresponden", caramelos_por_alumno, "caramelos.")
print("Sobran", caramelos_sobrantes, "caramelos en la bolsa.")
