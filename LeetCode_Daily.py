import os
import subprocess

def main():
	result = subprocess.check_output("ls ~/Developer/LeetCode_Staged/ | head -n 1", shell=True)
	result2 = str(result.replace(" ", "\ "))[:-1]
	print "cp -R ~/Developer/LeetCode_Staged/" + result2 + " ."
	subprocess.check_output("cp -R ~/Developer/LeetCode_Staged/" + result2 + " .", shell=True)
	subprocess.check_output("git add " + result2, shell=True)
	subprocess.check_output("git commit -m \"Add " + result + "\"", shell=True)
	subprocess.check_output("rm -R ~/Developer/LeetCode_Staged/" + result2, shell=True)
	subprocess.check_output("git push", shell=True)


if __name__ == "__main__":
    main()
