def call(Map args) {
    def imageName = args.imageName
    def imageVersion = args.imageVersion
    echo "Building ${imageName} with tag ${imageVersion}"
}
