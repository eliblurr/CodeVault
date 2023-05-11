# GIT version control cheatsheet

## working directory
```
directory or folder where operations are performed
```
## staging area
```
Staging area is where files that are going to be a part of the next commit are added
```
## remote repo 
```
versions of your project that are hosted on the internet or some network somewhere
```
## local repo 
```
version of your project that exists locally on yout device
```

## initialise repo 
```
git init
```

## create a new branch repo 
```
git checkout -b <branch_name>
```

or 

```
git switch -c <branch_name>
```

## stage file
```
git add <directories or file paths you want to stage>
```

## commit changes
```
git commit -m "<any message of choice>"
```

## commit messages
```
should be descriptive and easily understand
```

## push changes
```
git push
git push <remote name .e.g. origin> {push to specific remote}
git push <remote name .e.g. origin> <branch_name> {push to specific remote branch}
```

## branch status
```
git checkout <branch_name>
git status
```

## switch branches
```
git checkout <branch_name>
```

or 

```
git switch <branch_name>
```

## fetch remote
```
git fetch <remote e.g. origin>
```

branch
```
git fetch <remote e.g. origin> <branch>
```

all
```
git fetch --all
```

## merge branch
branch to merge into -> destination
branch to merge from -> source
```
git checkout <dest>
git merge <source>
```

## git stash
takes uncommitted changes (both staged and unstaged), saves them away for later use, and then reverts them from your working copy.
```
git status
On branch main
Changes to be committed:
    new file:   newfile.css

Changes not staged for commit:
    modified:   README.md.

git stash
Saved working directory and index state WIP on main: 5002d47 our new homepage
HEAD is now at 5002d47 our new homepage

git status
On branch main
nothing to commit, working tree clean
```

## re-apply stash
```
git stash pop
```

## re-apply stash and still keep them in stash
```
git stash apply
```

## git rebase
process of moving or combining a sequence of commits to a new base commit. 
```
```

## useful
```
git config --get-all remote.origin.fetch  -> see remote fetch urls and params
git config --unset-all remote.origin.fetch -> unset remote fetch urls and params
git config --add remote.origin.fetch +refs/heads/my_name/*:refs/remotes/origin/my_name/* -> add remote to all branches
git config --add remote.origin.fetch +refs/heads/master:refs/remotes/origin/master -> add remote to to master branch
git remote set-url origin /original/repo
git remote set-url --push origin /your/fork
```

### Changing a Git Remote’s URL 
```
git remote set-url <remote-name> <remote-url>
```

### git log
see history
–-stat option is used with the `git log` command to display some state information with the commit history
```
git log
```

view history details
```
git show <commit_id>
```

