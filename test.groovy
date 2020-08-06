def a = "ok"
def value = false
def arr = [1, 2, 3]

class class1 {
    def value = 2

    class1() {

    }

    int fn() {
        return this.value
    }
}

void fn() {
    print "fn"
}

for (i = 1; i < 10; i++) {
    println i + " " + "Test" + " " + a
}

for (item in arr) {
    print item
}

print value
fn()
def c = new class1()
print c.fn()