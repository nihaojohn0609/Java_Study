public class PaintJob {

    public static void main(String[] args) {

    }

//    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
//
//        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
//            return -1;
//        } else {
//            return (int)(Math.ceil(width * height / areaPerBucket - extraBuckets));
//        }
//    }
//
//    public static int getBucketCount(double width, double height, double areaPerBucket) {
//
//        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
//            return -1;
//        } else {
//            return (int)Math.ceil(width * height / areaPerBucket);
//        }
//    }
//
//    public static int getBucketCount(double area, double areaPerBucket) {
//
//        if(area <= 0 || areaPerBucket <= 0) {
//            return -1;
//        } else {
//            return (int)Math.ceil(area / areaPerBucket);
//        }
//    }

//    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
//
//        return (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) ? -1 : (int)Math.ceil(width * height / areaPerBucket - extraBuckets);
//    }
//
//    public static int getBucketCount(double width, double height, double areaPerBucket) {
//
//        return (width <= 0 || height <= 0 || areaPerBucket <= 0) ? -1 : (int) Math.ceil(width * height / areaPerBucket);
//    }
//
//    public static int getBucketCount(double area, double areaPerBucket) {
//
//        return (area <= 0 || areaPerBucket <= 0) ? -1 : (int)Math.ceil(area / areaPerBucket);
//    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        return (int) Math.ceil(width * height / areaPerBucket - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        return getBucketCount(width, height, areaPerBucket, 0); // call first method
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        return getBucketCount(area, 1, areaPerBucket, 0);   // call first method where width * height = area is the same as area * 1 = area
    }

}
