def solution(todo_list, finished):
    answer = []
    for todo, isFinish in zip(todo_list, finished):
        if not isFinish :
            answer.append(todo)
    
    return answer