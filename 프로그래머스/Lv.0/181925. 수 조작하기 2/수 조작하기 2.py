def solution(numLog):
    answer = ''
    key = { 1 : "w", -1 :"s", 10 :"d", -10:"a"}
    for i in range(1, len(numLog)):
        answer += key[numLog[i] - numLog[i-1]]
        
    return answer