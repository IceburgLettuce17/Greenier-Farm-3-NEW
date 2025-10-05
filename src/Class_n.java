// 
// Decompiled by Procyon v0.6.0
// 

final class Class_n
{
    private static int[] var_1ad;
    private short[] var_1b5;
    private short[] var_1bd;
    private short[] var_1c5;
    private short[] var_1cd;
    private short[] var_1d5;
    private int var_1dd;
    private int var_1e5;
    private int var_1ed;
    private int var_1f5;
    private int var_1fd;
    private int var_205;
    private byte[] var_20d;
    private int var_215;
    private short[] var_21d;
    private int var_225;
    private int var_22d;
    
    public Class_n() {
    }
    
    public final void sub_26c(final int n, final int n2, final byte[] var_20d, final int n3, final int n4, final int n5, final int n6) {
        this.var_1fd = 96;
        this.var_205 = 96;
        this.var_20d = var_20d;
        this.var_215 = -1;
        this.var_1dd = 14;
        this.var_1e5 = 10;
        this.var_1ed = 10;
        this.var_1f5 = 8;
        this.var_1b5 = new short[9216];
        this.var_1bd = new short[9216];
        this.var_1c5 = new short[9216];
        this.var_1cd = new short[9216];
        this.var_1d5 = new short[9216];
        this.var_22d = -1;
        this.var_21d = new short[9216];
        this.var_225 = -1;
    }
    
    final void sub_2f7(int i, int n, int n2, int n3, int abs) {
        final int n4 = i;
        final int n5 = n;
        final int n6 = n3;
        final int n7 = abs;
        final int var_1fd = this.var_1fd;
        final int var_205 = this.var_205;
        final int n8 = var_1fd;
        abs = n7;
        n3 = n6;
        n = n5;
        i = n4;
        n2 = 0;
        for (int j = 0; j < 9216; ++j) {
            this.var_1b5[j] = -1;
            this.var_1bd[j] = -1;
            this.var_1c5[j] = -1;
            this.var_1cd[j] = 0;
            this.var_1d5[j] = 0;
            this.var_21d[j] = 0;
        }
        this.var_22d = -1;
        i += n * n8;
        final int n9 = n3;
        final int n10 = abs;
        while (i != -1) {
            this.sub_b6e(i);
            final short n11 = this.var_1cd[i];
            this.var_1cd[i] = -1;
            this.var_1d5[i] = -1;
            n = i % n8;
            n3 = i / n8;
            if (n == n9 && n3 == n10) {
                break;
            }
            for (int k = 0; k < this.var_1f5; ++k) {
                abs = n + Class_n.var_1ad[k << 1];
                final int n12 = n3 + Class_n.var_1ad[(k << 1) + 1];
                if (abs >= 0 && abs < n8) {
                    if (n12 >= 0 && n12 < var_205) {
                        final int n13 = n12 * n8 + abs;
                        if (this.var_1cd[n13] != -1) {
                            int n14 = this.var_1dd;
                            if (k >= 4) {
                                n14 = this.var_1e5;
                                final int n15 = i % n8;
                                final int n16 = i / n8;
                                if (k == 4) {
                                    if ((this.var_20d[n16 * this.var_1fd + (n15 - 1)] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                    if ((this.var_20d[(n16 - 1) * this.var_1fd + n15] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                }
                                else if (k == 5) {
                                    if ((this.var_20d[n16 * this.var_1fd + (n15 + 1)] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                    if ((this.var_20d[(n16 - 1) * this.var_1fd + n15] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                }
                                else if (k == 6) {
                                    if ((this.var_20d[n16 * this.var_1fd + (n15 - 1)] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                    if ((this.var_20d[(n16 + 1) * this.var_1fd + n15] & this.var_215) != 0x0) {
                                        continue;
                                    }
                                }
                                else if (k == 7 && ((this.var_20d[n16 * this.var_1fd + (n15 + 1)] & this.var_215) != 0x0 || (this.var_20d[(n16 + 1) * this.var_1fd + n15] & this.var_215) != 0x0)) {
                                    continue;
                                }
                            }
                            if ((this.var_20d[n12 * this.var_1fd + abs] & this.var_215) == 0x0) {
                                final int n17 = n11 + n14 + ((n2 == k) ? 0 : this.var_1ed);
                                abs = Math.abs(abs - n9);
                                final int abs2 = Math.abs(n12 - n10);
                                if (this.var_1f5 == 4) {
                                    abs = this.var_1dd * (abs + abs2);
                                }
                                else if (abs > abs2) {
                                    abs = this.var_1e5 * abs2 + this.var_1dd * (abs - abs2);
                                }
                                else {
                                    abs = this.var_1e5 * abs + this.var_1dd * (abs2 - abs);
                                }
                                if (this.var_1bd[n13] == -1 && this.var_1c5[n13] == -1 && this.var_22d != n13) {
                                    this.var_1b5[n13] = (short)i;
                                    this.var_1cd[n13] = (short)n17;
                                    this.var_1d5[n13] = (short)abs;
                                    this.sub_a57(n13);
                                }
                                else if (this.var_1cd[n13] > n17) {
                                    this.var_1b5[n13] = (short)i;
                                    this.var_1cd[n13] = (short)n17;
                                    this.sub_b6e(n13);
                                    this.sub_a57(n13);
                                }
                            }
                        }
                    }
                }
            }
            if ((i = this.var_22d) == -1) {
                continue;
            }
            n = this.var_1b5[i];
            if (i % n8 != n % n8) {
                if (i % n8 > n % n8) {
                    n2 = 3;
                }
                else {
                    n2 = 2;
                }
            }
            else if (i / n8 != n / n8) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
        }
        if (i == -1) {
            this.var_225 = -1;
            return;
        }
        this.var_225 = 0;
        while (i != -1) {
            final int n18 = i % n8;
            final int n19 = i / n8;
            final short[] var_21d = this.var_21d;
            final int n20 = this.var_225++;
            final int n21 = n18;
            n3 = n19;
            n2 = n21;
            var_21d[n20] = (short)(n3 * this.var_1fd + n2);
            i = this.var_1b5[i];
        }
        --this.var_225;
    }
    
    final int sub_9e2() {
        return this.var_225 + 1;
    }
    
    final int sub_a03(int n) {
        n = this.var_21d[n];
        return n % this.var_1fd;
    }
    
    final int sub_a2d(int n) {
        n = this.var_21d[n];
        return n / this.var_1fd;
    }
    
    private void sub_a57(final int n) {
        if (this.var_22d == -1) {
            this.var_22d = n;
            return;
        }
        final int n2 = this.var_1cd[n] + this.var_1d5[n];
        for (int i = this.var_22d; i != -1; i = this.var_1c5[i]) {
            if (n2 < this.var_1cd[i] + this.var_1d5[i]) {
                if (this.var_1bd[i] == -1) {
                    this.var_22d = n;
                }
                else {
                    this.var_1c5[this.var_1bd[i]] = (short)n;
                }
                this.var_1bd[n] = this.var_1bd[i];
                this.var_1c5[n] = (short)i;
                this.var_1bd[i] = (short)n;
                return;
            }
            if (this.var_1c5[i] == -1) {
                this.var_1c5[i] = (short)n;
                this.var_1bd[n] = (short)i;
                return;
            }
        }
    }
    
    private void sub_b6e(final int n) {
        if (this.var_1c5[n] != -1) {
            this.var_1bd[this.var_1c5[n]] = this.var_1bd[n];
        }
        if (this.var_22d == n) {
            this.var_22d = this.var_1c5[n];
        }
        else if (this.var_1bd[n] != -1) {
            this.var_1c5[this.var_1bd[n]] = this.var_1c5[n];
        }
        this.var_1bd[n] = -1;
        this.var_1c5[n] = -1;
    }
    
    static {
        Class_n.var_1ad = new int[] { 0, -1, 0, 1, -1, 0, 1, 0, -1, -1, 1, -1, -1, 1, 1, 1 };
    }
}
