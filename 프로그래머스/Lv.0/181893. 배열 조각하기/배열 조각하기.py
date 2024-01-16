def solution(arr, query):
    for i, index in enumerate(query):
        if i%2:
            arr = arr[index:]
        else:
            arr = arr[:index+1]
    return arr