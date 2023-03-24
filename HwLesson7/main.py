from manager import TaskManager
import time


manager1 = TaskManager()
while True:
    print("""Привет! Выбери действие:
    1. Добавить новую задачу
    2. Показать все задачи
    3. Показать логи 
    4. Выйти""")
    choise = input(' >>>')


    if choise == '1':
        manager1.new_task()
    elif choise == '2':
        manager1.show_tasks()
    elif choise == '3':
        manager1.show_log()
    elif choise == "4":
        print("До встречи!")
        time.sleep(3)
        break
    else:
        print("Извини, есть только 4 действия")