def solution(ineq, eq, n, m):
    answer = eval(f"{n}{ineq}{eq.replace('!','')}{m}")
        
    return int(answer)