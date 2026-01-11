def call(Map config) {
    git url: config.repoUrl, branch: config.branch
}
