public class Main {

    public static void main (String[] args) {

        AbstractVector avec2d = new Vector2d(4, 4);
        Vector2d vec2d = new Vector2d(4, 4);

        AbstractVector avec3d = new Vector3d(3, 3, 2);
        Vector3d vec3d = new Vector3d(3, 13, 2);

        System.out.println(avec2d.sumVec(vec2d).toString());
        System.out.println(avec2d.sumVec(vec2d));
        System.out.println(avec2d.scalar(vec2d));
        System.out.println(avec3d.sumVec3d(vec3d).toString());
        System.out.println(avec3d.subVec3d(vec3d).toString());
        System.out.println(avec3d.scalar3d(vec3d));

    }
}
