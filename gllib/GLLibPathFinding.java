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
    private int var_1dd;
    private int var_1e5;
    private int var_1ed;
    private int var_1f5;
    private int m_nMapW;
    private int var_205;
    private byte[] var_20d;
    private int var_215;
    private short[] m_path;
    private int m_pathIdx;
    private int m_openedSortedList;
    
    public GLLibPathFinding() {
    }
    
    public final void PathFinding_Init(final int n, final int n2, final byte[] var_20d, final int n3, final int n4, final int n5, final int n6) {
        this.m_nMapW = 96;
        this.var_205 = 96;
        this.var_20d = var_20d;
        this.var_215 = -1;
        this.var_1dd = 14;
        this.var_1e5 = 10;
        this.var_1ed = 10;
        this.var_1f5 = 8;
        this.m_nodeParent = new short[9216];
        this.m_nodePrev = new short[9216];
        this.m_nodeNext = new short[9216];
        this.m_nodeG = new short[9216];
        this.m_nodeH = new short[9216];
        this.m_openedSortedList = -1;
        this.m_path = new short[9216];
        this.m_pathIdx = -1;
    }
    
    final void PathFinding_Exec(int i, int n, int n2, int n3, int abs) {
        n2 = 0;
        for (int j = 0; j < 9216; ++j) {
            this.m_nodeParent[j] = -1;
            this.m_nodePrev[j] = -1;
            this.m_nodeNext[j] = -1;
            this.m_nodeG[j] = 0;
            this.m_nodeH[j] = 0;
            this.m_path[j] = 0;
        }
        this.m_openedSortedList = -1;
        i += n * m_nMapW;
        while (i != -1) {
            this.listRem(i);
            this.m_nodeG[i] = -1;
            this.m_nodeH[i] = -1;
            n = i % m_nMapW;
            n3 = i / m_nMapW;
            if (n == n3 && n3 == abs) {
                break;
            }
            for (int k = 0; k < this.var_1f5; ++k) {
                abs = n + GLLibPathFinding.kDirPrecalc[k << 1];
                final int n12 = n3 + GLLibPathFinding.kDirPrecalc[(k << 1) + 1];
                if (abs >= 0 && abs < m_nMapW) {
                    if (n12 >= 0 && n12 < var_205) {
                        final int n13 = n12 * m_nMapW + abs;
                        if (this.m_nodeG[n13] != -1) {
                            int n14 = this.var_1dd;
                            if (k >= 4) {
                                n14 = this.var_1e5;
                                final int n15 = i % m_nMapW;
                                final int n16 = i / m_nMapW;
                                if (k == 4) {
                                    if ((this.var_20d[n16 * this.m_nMapW + (n15 - 1)] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                    if ((this.var_20d[(n16 - 1) * this.m_nMapW + n15] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                }
                                else if (k == 5) {
                                    if ((this.var_20d[n16 * this.m_nMapW + (n15 + 1)] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                    if ((this.var_20d[(n16 - 1) * this.m_nMapW + n15] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                }
                                else if (k == 6) {
                                    if ((this.var_20d[n16 * this.m_nMapW + (n15 - 1)] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                    if ((this.var_20d[(n16 + 1) * this.m_nMapW + n15] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                }
                                else if (k == 7 && ((this.var_20d[n16 * this.m_nMapW + (n15 + 1)] & this.var_215) != 0x0 || (this.var_20d[(n16 + 1) * this.m_nMapW + n15] & this.var_215) != 0x0)) {
                                    continue;
                                }
                            }
                            if ((this.var_20d[n12 * this.m_nMapW + abs] & this.var_215) == 0x0) {
                                final int n17 = this.m_nodeG[i] + n14 + ((n2 == k) ? 0 : this.var_1ed);
                                abs = Math.abs(abs - n3);
                                final int abs2 = Math.abs(n12 - abs);
                                if (this.var_1f5 == 4) {
                                    abs = this.var_1dd * (abs + abs2);
                                }
                                else if (abs > abs2) {
                                    abs = this.var_1e5 * abs2 + this.var_1dd * (abs - abs2);
                                }
                                else {
                                    abs = this.var_1e5 * abs + this.var_1dd * (abs2 - abs);
                                }
                                if (this.m_nodePrev[n13] == -1 && this.m_nodeNext[n13] == -1 && this.m_openedSortedList != n13) {
                                    this.m_nodeParent[n13] = (short)i;
                                    this.m_nodeG[n13] = (short)n17;
                                    this.m_nodeH[n13] = (short)abs;
                                    this.listAdd(n13);
                                }
                                else if (this.m_nodeG[n13] > n17) {
                                    this.m_nodeParent[n13] = (short)i;
                                    this.m_nodeG[n13] = (short)n17;
                                    this.listRem(n13);
                                    this.listAdd(n13);
                                }
                            }
                        }
                    }
                }
            }
            if ((i = this.m_openedSortedList) == -1) {
                continue;
            }
            n = this.m_nodeParent[i];
            if (i % m_nMapW != n % m_nMapW) {
                if (i % m_nMapW > n % m_nMapW) {
                    n2 = 3;
                }
                else {
                    n2 = 2;
                }
            }
            else if (i / m_nMapW != n / m_nMapW) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
        }
        if (i == -1) {
            this.m_pathIdx = -1;
            return;
        }
        this.m_pathIdx = 0;
        while (i != -1) {
            n3 = i / m_nMapW;
            n2 = i % m_nMapW;
            m_path[this.m_pathIdx++] = (short)(n3 * this.m_nMapW + n2);
            i = this.m_nodeParent[i];
        }
        --this.m_pathIdx;
    }
    
    final int PathFinding_GetPathLength() {
        return this.m_pathIdx + 1;
    }
    
    final int sub_a03(int n) {
        n = this.m_path[n];
        return n % this.m_nMapW;
    }
    
    final int sub_a2d(int n) {
        n = this.m_path[n];
        return n / this.m_nMapW;
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
