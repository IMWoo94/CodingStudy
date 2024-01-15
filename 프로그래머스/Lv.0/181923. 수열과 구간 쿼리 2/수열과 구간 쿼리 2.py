def solution(arr, queries):
    answer = []
    for s,e,k in queries:
        a = [arr[num] for num in range(s, e+1) if arr[num] > k]
        if a:
            answer.append(min(a))
        else:
            answer.append(-1)
    
    return answer