from loggable import Loggable
from datetime import datetime


class Task(Loggable):
    def __init__(self, id, name, author, description, priority, deadline):
        self.id = id
        self.name = name
        self.author = author
        self.created = datetime.now()
        self.description = description
        self.priority = priority
        self.deadline = deadline

    def info(self):
        return f"Задача: {self.name}, id = {self.id}, исполнитель {self.author}, создана {self.created.strftime('%d %b %Y, %H:%M:%S')} \
    приоритет = {self.priority}, дедлайн: {self.deadline.strftime('%d %b %Y, %H:%M')} \
    описание: {self.description}"
