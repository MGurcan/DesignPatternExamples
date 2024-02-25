# Creational Pattern
## Prototype
---

Prototype lets you copy existing objects without making your code dependent on their classes.

### Prototype
The Prototype interface declares the cloning methods. In most cases, it’s a single clone method.

    public abstract class Shape {
        public abstract Shape clone();
        ...
    }

### Concrete Prototype
The Concrete Prototype class implements the cloning method.

    public class Circle extends Shape {
        public Circle() {
        }
        public Circle(Circle target) {
            super(target);
            if (target != null) {
                this.radius = target.radius;
            }
        }
        @Override
        public Shape clone() {
            return new Circle(this);
        }
        ...
    }