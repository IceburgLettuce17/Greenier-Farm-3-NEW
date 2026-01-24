// 
// Decompiled by Procyon v0.6.0
// 

final class GLLibPathFinding
{
    private static int[] kDirPrecalc;
    private short[] m_nodeParent;
    private short[] m_nodePrev;
    private short[] m_nodeNext;
    private short[] m_nodeG;
    private short[] m_nodeH;
    private int m_nCostMove;
    private int m_nCostMoveDiag;
    private int m_nCostChangeDir;
    private int m_nUseDirectionCount;
    private int m_nMapW;
    private int m_nMapH;
    private byte[] m_pPhysMap;
    private int m_nPhysMapMask;
    private short[] m_path;
    private int m_pathIdx;
    private int m_openedSortedList;
    
    public GLLibPathFinding() {
    }
    
    public final void PathFinding_Init(final int nMapWidth, final int nMapHeight, final byte[] pPhysicalMap, final int n3, final int n4, final int n5, final int n6) {
        this.m_nMapW = 96;
        this.m_nMapH = 96;
        this.m_pPhysMap = pPhysicalMap;
        this.m_nPhysMapMask = -1;
        this.m_nCostMove = 14;
        this.m_nCostMoveDiag = 10;
        this.m_nCostChangeDir = 10;
        this.m_nUseDirectionCount = 8;
        this.m_nodeParent = new short[9216];
        this.m_nodePrev = new short[9216];
        this.m_nodeNext = new short[9216];
        this.m_nodeG = new short[9216];
        this.m_nodeH = new short[9216];
        this.m_openedSortedList = -1;
        this.m_path = new short[9216];
        this.m_pathIdx = -1;
    }
    
    final void PathFinding_Exec(int start_x, int start_y, int start_dir, int end_x, int end_y) {
        start_dir = 0;
        for (int j = 0; j < 9216; ++j) {
            this.m_nodeParent[j] = -1;
            this.m_nodePrev[j] = -1;
            this.m_nodeNext[j] = -1;
            this.m_nodeG[j] = 0;
            this.m_nodeH[j] = 0;
            this.m_path[j] = 0;
        }
        this.m_openedSortedList = -1;
        start_x += start_y * m_nMapW;
        while (start_x != -1) {
            this.listRem(start_x);
            this.m_nodeG[start_x] = -1;
            this.m_nodeH[start_x] = -1;
            start_y = start_x % m_nMapW;
            end_x = start_x / m_nMapW;
            if (start_y == end_x && end_x == end_y) {
                break;
            }
            for (int k = 0; k < this.m_nUseDirectionCount; ++k) {
                end_y = start_y + GLLibPathFinding.kDirPrecalc[k << 1];
                final int n12 = end_x + GLLibPathFinding.kDirPrecalc[(k << 1) + 1];
                if (end_y >= 0 && end_y < m_nMapW) {
                    if (n12 >= 0 && n12 < m_nMapH) {
                        final int n13 = n12 * m_nMapW + end_y;
                        if (this.m_nodeG[n13] != -1) {
                            int n14 = this.m_nCostMove;
                            if (k >= 4) {
                                n14 = this.m_nCostMoveDiag;
                                final int n15 = start_x % m_nMapW;
                                final int n16 = start_x / m_nMapW;
                                if (k == 4) {
                                    if ((this.m_pPhysMap[n16 * this.m_nMapW + (n15 - 1)] & this.m_nPhysMapMask) != 0x0) {
                                        continue;
                                    }
                                    if ((this.m_pPhysMap[(n16 - 1) * this.m_nMapW + n15] & this.m_nPhysMapMask) != 0x0) {
                                        continue;
                                    }
                                }
                                else if (k == 5) {
                                    if ((this.m_pPhysMap[n16 * this.m_nMapW + (n15 + 1)] & this.m_nPhysMapMask) != 0x0) {
                                        continue;
                                    }
                                    if ((this.m_pPhysMap[(n16 - 1) * this.m_nMapW + n15] & this.m_nPhysMapMask) != 0x0) {
                                        continue;
                                    }
                                }
                                else if (k == 6) {
                                    if ((this.m_pPhysMap[n16 * this.m_nMapW + (n15 - 1)] & this.m_nPhysMapMask) != 0x0) {
                                        continue;
                                    }
                                    if ((this.m_pPhysMap[(n16 + 1) * this.m_nMapW + n15] & this.m_nPhysMapMask) != 0x0) {
                                        continue;
                                    }
                                }
                                else if (k == 7 && ((this.m_pPhysMap[n16 * this.m_nMapW + (n15 + 1)] & this.m_nPhysMapMask) != 0x0 || (this.m_pPhysMap[(n16 + 1) * this.m_nMapW + n15] & this.m_nPhysMapMask) != 0x0)) {
                                    continue;
                                }
                            }
                            if ((this.m_pPhysMap[n12 * this.m_nMapW + end_y] & this.m_nPhysMapMask) == 0x0) {
                                final int n17 = this.m_nodeG[start_x] + n14 + ((start_dir == k) ? 0 : this.m_nCostChangeDir);
                                end_y = Math.abs(end_y - end_x);
                                final int abs2 = Math.abs(n12 - end_y);
                                if (this.m_nUseDirectionCount == 4) {
                                    end_y = this.m_nCostMove * (end_y + abs2);
                                }
                                else if (end_y > abs2) {
                                    end_y = this.m_nCostMoveDiag * abs2 + this.m_nCostMove * (end_y - abs2);
                                }
                                else {
                                    end_y = this.m_nCostMoveDiag * end_y + this.m_nCostMove * (abs2 - end_y);
                                }
                                if (this.m_nodePrev[n13] == -1 && this.m_nodeNext[n13] == -1 && this.m_openedSortedList != n13) {
                                    this.m_nodeParent[n13] = (short)start_x;
                                    this.m_nodeG[n13] = (short)n17;
                                    this.m_nodeH[n13] = (short)end_y;
                                    this.listAdd(n13);
                                }
                                else if (this.m_nodeG[n13] > n17) {
                                    this.m_nodeParent[n13] = (short)start_x;
                                    this.m_nodeG[n13] = (short)n17;
                                    this.listRem(n13);
                                    this.listAdd(n13);
                                }
                            }
                        }
                    }
                }
            }
            if ((start_x = this.m_openedSortedList) == -1) {
                continue;
            }
            start_y = this.m_nodeParent[start_x];
            if (start_x % m_nMapW != start_y % m_nMapW) {
                if (start_x % m_nMapW > start_y % m_nMapW) {
                    start_dir = 3;
                }
                else {
                    start_dir = 2;
                }
            }
            else if (start_x / m_nMapW != start_y / m_nMapW) {
                start_dir = 1;
            }
            else {
                start_dir = 0;
            }
        }
        if (start_x == -1) {
            this.m_pathIdx = -1;
            return;
        }
        this.m_pathIdx = 0;
        while (start_x != -1) {
            end_x = start_x / m_nMapW;
            start_dir = start_x % m_nMapW;
            m_path[this.m_pathIdx++] = (short)(end_x * this.m_nMapW + start_dir);
            start_x = this.m_nodeParent[start_x];
        }
        --this.m_pathIdx;
    }
    
    final int PathFinding_GetPathLength() {
        return this.m_pathIdx + 1;
    }
    
    final int PathFinding_GetPathPositionX(int nIndex) {
        nIndex = this.m_path[nIndex];
        return nIndex % this.m_nMapW;
    }
    
    final int PathFinding_GetPathPositionY(int nIndex) {
        nIndex = this.m_path[nIndex];
        return nIndex / this.m_nMapW;
    }
    
    private void listAdd(final int e_idx) {
        if (this.m_openedSortedList == -1) {
            this.m_openedSortedList = e_idx;
            return;
        }
        final int n2 = this.m_nodeG[e_idx] + this.m_nodeH[e_idx];
        for (int i = this.m_openedSortedList; i != -1; i = this.m_nodeNext[i]) {
            if (n2 < this.m_nodeG[i] + this.m_nodeH[i]) {
                if (this.m_nodePrev[i] == -1) {
                    this.m_openedSortedList = e_idx;
                }
                else {
                    this.m_nodeNext[this.m_nodePrev[i]] = (short)e_idx;
                }
                this.m_nodePrev[e_idx] = this.m_nodePrev[i];
                this.m_nodeNext[e_idx] = (short)i;
                this.m_nodePrev[i] = (short)e_idx;
                return;
            }
            if (this.m_nodeNext[i] == -1) {
                this.m_nodeNext[i] = (short)e_idx;
                this.m_nodePrev[e_idx] = (short)i;
                return;
            }
        }
    }
    
    private void listRem(final int e_idx) {
        if (this.m_nodeNext[e_idx] != -1) {
            this.m_nodePrev[this.m_nodeNext[e_idx]] = this.m_nodePrev[e_idx];
        }
        if (this.m_openedSortedList == e_idx) {
            this.m_openedSortedList = this.m_nodeNext[e_idx];
        }
        else if (this.m_nodePrev[e_idx] != -1) {
            this.m_nodeNext[this.m_nodePrev[e_idx]] = this.m_nodeNext[e_idx];
        }
        this.m_nodePrev[e_idx] = -1;
        this.m_nodeNext[e_idx] = -1;
    }
    
    static {
        GLLibPathFinding.kDirPrecalc = new int[] { 0, -1, 0, 1, -1, 0, 1, 0, -1, -1, 1, -1, -1, 1, 1, 1 };
    }
}
