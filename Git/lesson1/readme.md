# Lesson 1: What is Version Control? 🗂️

#### If You Prefer Video Click Image To Watch👇👇👇👇👇

[![Watch the Video](https://img.youtube.com/vi/HksoPN2Pa2s/0.jpg)](https://youtube.com/live/HksoPN2Pa2s)

---

## 📚 Learning Objectives

By the end of this lesson, you will:

1. Define **Version Control** and its purpose.
2. Understand the difference between **Centralized** and **Distributed VCS**.
3. Recognize popular VCS tools like **Git**, **SVN**, and **Mercurial**.

---

## 🔑 Key Concepts

### 1. Definition of Version Control

**Version Control** (also called **Source Control**) is a system that records changes to files over time, allowing you to:

- Track **who** made changes.
- Revert files to a previous state.
- Collaborate without overwriting others’ work.

<iframe width="560" height="315" src="https://www.youtube.com/embed/HksoPN2Pa2s" frameborder="0" allowfullscreen></iframe>

> 💡 **Analogy**: Imagine editing a paper with "Track Changes" turned on forever, but better organized and automated! Like having an infinite undo button, being able to create experimental versions without messing up the original, and seamlessly merging changes from multiple editors - all while keeping a detailed history of who did what and when.

---

### 2. Why Use Version Control?

- **Backup & Recovery**: Restore deleted files or undo mistakes.
- **Collaboration**: Multiple people can work on the same project.
- **History**: See how your project evolved over time.

---

### 3. Centralized vs Distributed VCS

| **Centralized (e.g., SVN)** | **Distributed (e.g., Git)** |
| --------------------------- | --------------------------- |
| Single central repository   | Every user has a full copy  |
| Requires internet to commit | Work offline, sync later    |
| Slower for large teams      | Faster and more flexible    |

---

## 🛠️ Real-World Examples

1. **Software Development**: Track code changes across teams.
2. **Document Collaboration**: Avoid conflicting edits in shared files.
3. **Academic Writing**: Maintain drafts of research papers.

---

## 🚀 Benefits of VCS

✅ **Collaboration**: Merge changes safely.  
✅ **Accountability**: Track who changed what.  
✅ **Disaster Recovery**: Roll back to any saved state.

---

## 🌟 Popular VCS Tools

1. **Git**: Most widely used (created by Linus Torvalds).
2. **GitHub/GitLab/Bitbucket**: Platforms for hosting Git repositories.
3. **Subversion (SVN)**: Older centralized system.

---

## 🖥️ Hands-On: Your First Steps

### Initialize a Git Repository

#### Create a project folder

```bash
mkdir my-first-project
cd my-first-project
```

#### Turn this folder into a Git repo

```bash
git init
```

#### Commit a File

```bash
echo "Hello, Version Control!" > README.md
```

```bash
git add README.md
```

```bash
git commit -m "Initial commit: Add README"
```

#### Check Status

```bash
git status
```

## 📝 Exercises

1. **Exercise 1**: Create a local Git repository and commit a file named notes.txt.
2. **Exercise 2**: Research and list 3 differences between SVN and Git.

<details> <summary>🔍 Exercise Solutions</summary>

### Solution 1:

```bash
mkdir exercise-repo
cd exercise-repo
git init
echo "Version Control is fun!" > notes.txt
git add notes.txt
git commit -m "Add notes.txt"
```

### Solution 2:

Architecture: SVN is centralized; Git is distributed.
Speed: Git is faster for most operations.
Branching: Git branches are lightweight; SVN branches are directories.

</details>
