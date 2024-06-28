const core = require('@actions/core');
const execSync = require('child_process').execSync;
const fs = require('fs');

function run() {
  try {
    // Constants
    const artifactoryUrl = 'https://your-artifactory-url/path/to/package.tgz';
    const packageCommand = 'node path/to/your/main.js'; // Example command to run the package

    // Get inputs
    const artifactoryUsername = core.getInput('artifactory-username');
    const artifactoryPassword = core.getInput('artifactory-password');

    // Download the package from Artifactory using curl
    execSync(`curl -u ${artifactoryUsername}:${artifactoryPassword} -O ${artifactoryUrl}`, { stdio: 'inherit' });

    // Extract the package
    execSync('tar -xzf package.tgz', { stdio: 'inherit' });

    // Install dependencies if package is a Node.js application
    if (fs.existsSync('package.json')) {
      execSync('npm install', { stdio: 'inherit' });
    }

    // Make sure the package command is executable
    execSync(`chmod +x ${packageCommand}`, { stdio: 'inherit' });

    // Run the package command
    execSync(packageCommand, { stdio: 'inherit' });

  } catch (error) {
    core.setFailed(`Action failed with error: ${error.message}`);
  }
}

run();
