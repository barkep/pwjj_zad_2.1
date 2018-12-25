public class Rational {
    private long val1;
    private long val2;

    Rational(long val1, long val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    Rational add(Rational arg) {
        long val1Temp = this.val1 * arg.val2;
        return new Rational((arg.val1 * this.val2) + val1Temp, arg.val2 * this.val2);
    }

    Rational mul(Rational arg) {
        return new Rational(arg.val1 * this.val1, arg.val2 * this.val2);
    }

    Rational sub(Rational arg) {
        long val1Temp = this.val1 * arg.val2;
        return new Rational((arg.val1 * this.val2) - val1Temp, arg.val2 * this.val2);
    }

    Rational div(Rational arg) {
        return new Rational(arg.val1 / this.val1, arg.val2 / this.val2);
    }

    boolean equals(Rational arg) {
        return this.val1 * arg.val2 == arg.val1 * this.val2;
    }

    int compareTo(Rational arg) {
        if (equals(arg)) {
            return 0;
        } else if (argSmallerThanThis(arg)) {
            return -1;
        } else {
            return 1;
        }
    }

    private boolean argSmallerThanThis(Rational arg) {
        return this.val1 * arg.val2 < arg.val1 * this.val2;
    }

    public String toString() {
        return this.val1 + "/" + this.val2;
    }

    void fraction() {
        if (this.val1 != 0 && this.val2 != 0) {
            long value1 = this.val1;
            if (value1 < 0) {
                value1 *= -1;
            }
            long value2 = this.val2;
            if (value2 < 0) {
                value2 *= -1;
            }
            while (value1 != value2) {
                if (value1 > value2) {
                    value1 -= value2;
                } else {
                    value2 -= value1;
                }
            }
            this.val1 /= value1;
            this.val2 /= value1;
        }
    }
}
