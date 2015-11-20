import os
import subprocess

def main():
	result = subprocess.check_output("ls /Users/fabriziodemaria/Developer/LeetCode_Staged/ | grep -v '^\.' | head -n 1", shell=True)
	result2 = str(result.replace(" ", "\ "))[:-1]
	print "( cd /Users/fabriziodemaria/Developer/LeetCode_Solutions && cp -R /Users/fabriziodemaria/Developer/LeetCode_Staged/" + result2 + " . )"
	subprocess.check_output("cp -R /Users/fabriziodemaria/Developer/LeetCode_Staged/" + result2 + " .", shell=True)
	subprocess.check_output("( cd /Users/fabriziodemaria/Developer/LeetCode_Solutions && git add " + result2 + " )", shell=True)
	subprocess.check_output("( cd /Users/fabriziodemaria/Developer/LeetCode_Solutions && git commit -m \"Add " + result + "\" )", shell=True)
	subprocess.check_output("rm -R /Users/fabriziodemaria/Developer/LeetCode_Staged/" + result2, shell=True)
	subprocess.check_output("( cd /Users/fabriziodemaria/Developer/LeetCode_Solutions && git push )", shell=True)


if __name__ == "__main__":
    main()
