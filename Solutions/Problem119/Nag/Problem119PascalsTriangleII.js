/**
 * @param {number} rowIndex
 * @return {number[]}
 */
 var getRow = function(rowIndex) {
    if(rowIndex == 0) return [1];
    if(rowIndex == 1) return [1,1];
    let res = [1,1]
    
    for(let i= 1; i<rowIndex; i++){
        const r = []
        r.push(1)
        for(let j=0; j<i; j++){
            r[j+1] = res[j]+res[j+1]
        }
        r.push(1)
        res = r
    }
    return res
};