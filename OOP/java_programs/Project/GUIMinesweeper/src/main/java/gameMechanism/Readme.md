



Top-Left    Top     Top-Right
Left       [CELL]   Right
Bot-Left    Bot     Bot-Right





r0c0  r0c1  r0c2
r1c0  r1c1  r1c2
r2c0  r2c1  r2c2





















for clearity

Cell cell = grid[i][j];




























int countMinesAround(int r, int c) {
    int count = 0;

    // Loop through row offsets: -1 (up), 0 (same), 1 (down)
    for (int dR = -1; dR <= 1; dR++) {
        // Loop through column offsets: -1 (left), 0 (same), 1 (right)
        for (int dC = -1; dC <= 1; dC++) {
            
            // 1. Skip the cell itself (where both offsets are 0)
            if (dR == 0 && dC == 0) continue;

            int neighborR = r + dR;
            int neighborC = c + dC;

            // 2. Check bounds first using your isValid method!
            if (isValid(neighborR, neighborC)) {
                
                // 3. Now it's safe to access the grid
                if (grid[neighborR][neighborC].isMine) {
                    count++;
                }
            }
        }
    }
    return count;
}